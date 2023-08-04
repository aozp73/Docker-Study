<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Shop Server</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container d-flex ml-4 mt-4 align-items-center">
        <h2 class="button-text">Shop Server</h2>
        <button class="btn btn-primary btn-mg ml-4" style="font-size: 17px;" id="myButton">Switch to News</button>
    </div>

    <script>
        $(document).ready(function() {
            $("#myButton").click(function() {
                window.location.href = "http://localhost:80/news/switchpage";
            });
        });
    </script>
</body>
</html>