<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Shoe App</title>
</head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
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
        background-color: black;
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
<body>


<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Weather</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">Enter the Details to book your Shoe!</h1>

<div class="container form-container">
    <form action="shoe" method="POST">
        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" class="form-control" name="brand">
        </div>
        <div class="mb-3">
            <div class="col">
                <label class="form-label">Shoe Type</label>
                <input type="text" class="form-control" name="type" >
            </div>

            <div class="col">
                <label class="form-label">Size</label>
                <input type="number" class="form-control" name="size" >
            </div>

            <div class="mb-3">
                <label class="form-label">Payment Method:</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="payment" id="cash" value="cash">
                    <label class="form-check-label" for="cash">Pay by Cash</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="payment" id="upi" value="upi">
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

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>