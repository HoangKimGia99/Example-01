<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration From</title>
</head>
<h3>Railway Registration From</h3>
<body>
      <form:form action="submitForm" modelAttribute="reservation">
            First name:<form:input path="firsName"/>
            <br></br>
            Last name:<form:input path="lastName"/>
            <br></br>
            Gender:
            Male<form:radiobutton path="Gender" value="Male"/>
            Female<form:radiobutton path="Gender" value="Female"/>
            <br></br>
            Meals:
            BreakFast<form:checkbox path="Food" value="BreakFast"/>
            Lunch<form:checkbox path="Food" value="Lunch"/>
            Dinner<form:checkbox path="Food" value="Dinner"/>
             <br></br>
             Leaving from:<form:select path="cityFrom">
             <form:option value="Ghaziabad" label="Ghaziabad"></form:option>
             <form:option value="Modinagar" label="Modinagar"></form:option>
             <form:option value="Meerut" label="Meerut"></form:option>
             <form:option value="Amristar" label="Amristar"></form:option>
             </form:select>
             <br></br>
             Going to:<form:select path="cityTo">
             <form:option value="Ghaziabad" label="Ghaziabad"></form:option>
             <form:option value="Modinagar" label="Modinagar"></form:option>
             <form:option value="Meerut" label="Meerut"></form:option>
             <form:option value="Amristar" label="Amristar"></form:option>
             </form:select>
             <br></br>
            <input type="submit" value="Submit"/>
       </form:form>
</body>
</html>