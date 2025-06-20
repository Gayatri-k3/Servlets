<%@ page import="com.xworkz.castle.dto.ShoeDTO" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Shoe App</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
            crossorigin="anonymous"></script>
    <style>
        body { background-color: #f8f9fa; }
        .form-container {
            max-width: 800px;
            margin: 40px auto;
            padding: 30px;
            background-color: white;
            border-radius: 20px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }
        .form-title { text-align: center; margin-bottom: 25px; color: black; }
        .btn-primary { padding: 10px 30px; font-weight: bold; background-color: black; }
        .navbar-brand { font-weight: bold; font-size: 24px; }
        h2 { color: red; margin-top: 20px; }
    </style>
</head>
<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Shoe App</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">Enter the Details to Book Your Shoe!</h1>

<div class="container form-container">
    <form action="shoe" method="POST">
        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" class="form-control" name="brand">
        </div>
        <div class="mb-3">
            <label class="form-label">Shoe Type</label>
            <input type="text" class="form-control" name="type">
        </div>
        <div class="mb-3">
            <label class="form-label">Size</label>
            <input type="number" class="form-control" name="size">
        </div>
        <div class="mb-3">
            <label class="form-label">Payment Method:</label><br>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="payment" value="cash" id="cash">
                <label class="form-check-label" for="cash">Pay by Cash</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="payment" value="upi" id="upi">
                <label class="form-check-label" for="upi">Pay by UPI</label>
            </div>
        </div>
        <div class="mb-3">
            <label class="form-label">Material</label>
            <input type="text" class="form-control" name="material">
        </div>
        <div class="mb-3">
            <label class="form-label">Manufactured Date</label>
            <input type="date" class="form-control" name="manDate">
        </div>
        <div class="d-grid gap-2">
            <button type="submit" class="btn btn-primary">Submit</button>
            <a class="btn btn-outline-primary" href="shoe?findAll=true">Find All Shoes</a>
        </div>
    </form>
</div>

<%-- ✅ Display ShoeDTO List if available --%>
<%
ShoeDTO[] shoeDTOs = (ShoeDTO[]) request.getAttribute("shoeDTOs");
if (shoeDTOs != null && shoeDTOs.length > 0) {
%>
<div class="container mt-5">
    <h3 class="text-center">All Booked Shoes</h3>
    <table class="table table-bordered table-striped mt-3">
        <thead class="table-dark">
        <tr>
            <th>Brand</th>
            <th>Type</th>
            <th>Size</th>
            <th>Payment</th>
            <th>Material</th>
            <th>Man. Date</th>
            <th>Created By</th>
            <th>Created At</th>
        </tr>
        </thead>
        <tbody>
        <% for (ShoeDTO shoe : shoeDTOs) { %>
        <tr>
            <td><%= shoe.getBrand() %></td>
            <td><%= shoe.getType() %></td>
            <td><%= shoe.getSize() %></td>
            <td><%= shoe.getPayment() %></td>
            <td><%= shoe.getMaterial() %></td>
            <td><%= shoe.getManDate() %></td>
            <td><%= shoe.getCreated_by() %></td>
            <td><%= shoe.getCreated_at() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
<%
}
%>

</body>
</html>
