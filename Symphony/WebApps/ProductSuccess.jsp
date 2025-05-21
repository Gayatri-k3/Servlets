
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">ProApp</a>
    </div>
</nav>

<div class="container mt-4">
    <h2 class="text-center mb-4 text-success">Product Booked Successfully!</h2>


    <table class="table table-bordered table-striped">
        <tr><th>Field</th><th>Value</th></tr>
        <tr><td>Name</td><td>${productDto.name}</td></tr>
        <tr><td>Type</td><td>${productDto.type}</td></tr>
        <tr><td>Incoming Price</td><td>${productDto.priceIn}</td></tr>
        <tr><td>Selling Price</td><td>${productDto.priceS}</td></tr>
        <tr><td>MRP</td><td>${productDto.mrp}</td></tr>
        <tr><td>Description</td><td>${productDto.desc}</td></tr>
        <tr><td>Brand</td><td>${productDto.brand}</td></tr>
        <tr><td>Quantity</td><td>${productDto.quantity}</td></tr>
        <tr><td>Color</td><td>${productDto.color}</td></tr>
        <tr><td>Weight</td><td>${productDto.weight} kg</td></tr>
        <tr><td>Manufacturing Date</td><td>${productDto.manfDate}</td></tr>
        <tr><td>Warranty</td><td>${productDto.warranty}</td></tr>
        <tr><td>Return Policy</td><td>${productDto.returnPolicy}</td></tr>
    </table>
</div>
</body>
</html>
