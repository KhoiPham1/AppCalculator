<%--
  Created by IntelliJ IDEA.
  User: Quang
  Date: 11/30/2018
  Time: 8:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form method="post" action="/calculate">
    <pre>
    <fieldset>
      <legend><h3>Calculator</h3></legend>
      First operand:  <input type="text" name="first operand"><br>
      Operator:       <select name="operator">
      <option value="addition">Addition</option>
      <option value="subtraction">Subtraction</option>
      <option value="multiplication">Multiplication</option>
      <option value="division">Division</option>
      </select><br>
      Second operand: <input type="text" name="second operand"><br>
                      <input type="submit" value="Calculate">
    </fieldset>
      </pre>
  </form>
  </body>
</html>
