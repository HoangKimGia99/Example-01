<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Product Page</title>
<style type="text/css">
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	border-color: #ccc;
	cellpadding: 10;
	cellspacing: 10;
}

.tg td {
	font-family: Arial, sans-serif;
	font-size: 14px;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #333;
	cellpadding: 10;
	cellspacing: 10;
}

.tg th {
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	padding: 10px 5px;
	border-style: solid;
	border-width: 1px;
	overflow: hidden;
	word-break: normal;
	border-color: #ccc;
	color: #3 33;
	background-color: #f0f0f0;
	cellpadding: 10;
	cellspacing: 10;
}

.tg .tg-4eph {
	background-color: #f9f9f9
}

a.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 10px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 10px 15px 10px 8px;
}

a.btn {
	background-color: #f44336;
	border: none;
	color: white;
	padding: 10px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 10px 15px 10px 8px;
}

.table {
	border: 1px;
}

.th {
	width: 10%;
}

.value {
	margin: 10px 15px 10px 8px;
}
</style>
</head>
<body>

	<h1>Add a Product</h1>
	<c:url var="addAction" value="/product/add"></c:url>
	<form:form action="${addAction}" commandName="product">
		<table>
			<c:if test="${!empty product.title}">
				<tr>
					<td><form:label path="id">
							<spring:message text="ID" />
						</form:label></td>
					<td><form:input path="id" readonly="true" size="8" disabled="true" /> <form:hidden path="id" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="title">
						<spring:message text="Title" />
					</form:label></td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td><form:label path="description">
						<spring:message text="Description" />
					</form:label></td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td><form:label path="price">
						<spring:message text="Price" />
					</form:label></td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><form:label path="price_net">
						<spring:message text="Price_net" />
					</form:label></td>
				<td><form:input path="price_net" /></td>
			</tr>
			<tr>
				<td><form:label path="available">
						<spring:message text="Available" />
					</form:label></td>
				<td><form:input path="available" /></td>
			</tr>
			<tr>
				<td><form:label path="sold">
						<spring:message text="Sold" />
					</form:label></td>
				<td><form:input path="sold" /></td>
			</tr>
			<tr>
				<td><form:label path="deal_timer">
						<spring:message text="Deal_timer" />
					</form:label></td>
				<td><form:input path="deal_timer" /></td>
			</tr>
			<tr>
				<td><form:label path="discount">
						<spring:message text="Discount" />
					</form:label></td>
				<td><form:input path="discount" /></td>
			</tr>
			<tr>
				<td><form:label path="image">
						<spring:message text="Image" />
					</form:label></td>
				<td><form:input path="image" /></td>
			</tr>
			<tr>
				<td><form:label path="cover">
						<spring:message text="Cover" />
					</form:label></td>
				<td><form:input path="cover" /></td>
			</tr>
			<tr>
				<td><form:label path="hot_deal">
						<spring:message text="Hot_deal" />
					</form:label></td>
				<td><form:input path="hot_deal" /></td>
			</tr>
			<tr>
				<td><form:label path="hot_new">
						<spring:message text="Hot_new" />
					</form:label></td>
				<td><form:input path="hot_new" /></td>
			</tr>
			<tr>
				<td><form:label path="hot_best">
						<spring:message text="Hot_best" />
					</form:label></td>
				<td><form:input path="hot_best" /></td>
			</tr>
			<tr>
				<td><form:label path="trend">
						<spring:message text="Trend" />
					</form:label></td>
				<td><form:input path="trend" /></td>
			</tr>
			<tr>
				<td><form:label path="latest_review">
						<spring:message text="Latest_review" />
					</form:label></td>
				<td><form:input path="latest_review" /></td>
			</tr>
			<tr>
				<td><form:label path="id_category">
						<spring:message text="Id_category" />
					</form:label></td>
				<td><form:input path="id_category" /></td>
			</tr>
			<tr>
				<td colspan="2"><c:if test="${!empty product.title}">
						<input type="submit" value="<spring:message text="Edit Product"/>" />
					</c:if> <c:if test="${empty product.title}">
						<input type="submit" value="<spring:message text="Add Product"/>"/>
					</c:if></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h3>Products List</h3>
	<c:if test="${!empty listProducts}">
		<table class="tg">
			<tr>
				<th width="80">ID</th>
				<th width="120">Product title</th>
				<th width="120">Description</th>
				<th width="60">price</th>
				<th width="80">price_net</th>
				<th width="120">available</th>
				<th width="120">sold</th>
				<th width="60">deal_timer</th>
				<th width="80">discount</th>
				<th width="120">image</th>
				<th width="120">cover</th>
				<th width="60">hot_deal</th>
				<th width="80">hot_new</th>
				<th width="120">hot_best</th>
				<th width="120">trend</th>
				<th width="60">latest_review</th>
				<th width="120">id_category</th>
				<th width="60">Action</th>
			</tr>
			<c:forEach items="${listProducts}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.title}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.price_net}</td>
					<td>${product.available}</td>
					<td>${product.sold}</td>
					<td>${product.deal_timer}</td>
					<td>${product.discount}</td>
					<td>${product.image}</td>
					<td>${product.cover}</td>
					<td>${product.hot_deal}</td>
					<td>${product.hot_new}</td>
					<td>${product.hot_best}</td>
					<td>${product.trend}</td>
					<td>${product.latest_review}</td>
					<td>${product.id_category}</td>
					<td><a href="<c:url value='/edit/${product.id}' />" class="button">Edit</a> 
					<a href="<c:url value='/remove/${product.id}' />" class="btn">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>
