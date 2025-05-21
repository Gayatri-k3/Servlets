<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Product</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .form-container {
            max-width: 800px;
            margin: 40px auto;
            padding: 30px;
            background-color: white;
            border-radius: 20px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        .form-title {
            text-align: center;
            margin-bottom: 25px;
            color: black;
        }

        .btn-primary {
            padding: 10px 30px;
            font-weight: bold;
        }

        .navbar-brand {
            font-weight: bold;
            font-size: 24px;
        }

        h2 {
            color: red;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">ProApp</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">Please Fill the Product Details</h1>

<!-- Form Container -->
<div class="container form-container">
    <form action="submit" method="POST">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" placeholder="Enter product name">
        </div>

        <div class="mb-3">
            <label class="form-label">Product Type</label>
            <select class="form-select" name="type">
                <option selected>Select</option>
                <option value="Mobile">Mobile</option>
                <option value="Laptop">Laptop</option>
                <option value="SmartWatch">SmartWatch</option>
            </select>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label class="form-label">Incoming Price</label>
                <input type="number" class="form-control" name="priceIn">
            </div>
            <div class="col">
                <label class="form-label">Selling Price</label>
                <input type="number" class="form-control" name="priceS">
            </div>
            <div class="col">
                <label class="form-label">MRP</label>
                <input type="number" class="form-control" name="mrp">
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea class="form-control" name="desc" rows="3" placeholder="Enter product description"></textarea>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label class="form-label">Brand</label>
                <input type="text" class="form-control" name="brand" placeholder="Enter brand name">
            </div>
            <div class="col">
                <label class="form-label">Quantity</label>
                <input type="number" class="form-control" name="quantity" placeholder="Enter quantity">
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Color</label>
            <select class="form-select" name="color">
                <option selected>Select</option>
                <option value="Black">Black</option>
                <option value="Pink">Pink</option>
                <option value="Blue">Blue</option>
                <option value="White">White</option>
            </select>
        </div>

        <div class="row mb-3">
            <div class="col">
                <label class="form-label">Weight (kg)</label>
                <input type="number" class="form-control" name="weight">
            </div>
            <div class="col">
                <label class="form-label">Manufactured Date</label>
                <input type="date" class="form-control" name="manf">
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Warranty</label>
            <select class="form-select" name="warranty">
                <option selected>Select</option>
                <option value="6 Months">6 Months</option>
                <option value="1 Year">1 Year</option>
                <option value="Lifetime">Lifetime</option>
                <option value="1 Month">1 Month</option>
            </select>
        </div>

        <div class="form-check mb-3">
            <input class="form-check-input" type="checkbox" value="No Return policy" name="checkChecked" id="checkReturn" checked>
            <label class="form-check-label" for="checkReturn">
                No Return Policy
            </label>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
