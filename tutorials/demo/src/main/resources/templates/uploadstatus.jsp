<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<body>

<h1>Spring Boot - Upload Status</h1>

<div th:if="${message}">
    <h2 th:text="${message}"></h2>
</div>

</body>
</html>