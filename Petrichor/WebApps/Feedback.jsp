<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Feedback</title>
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
<body>

<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">ProApp</a>
        <div class="d-flex">
            <a class="btn btn-outline-light" href="index.jsp">Home</a>
        </div>
    </div>
</nav>

<h2 class="text-center">${msg}</h2>
<h1 class="form-title">Feedback Form</h1>
<h2 class="form-title">Fill all the fields to give feedback</h2>


<div class="container form-container">
    <form action="submit" method="POST">
        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" placeholder="Enter student name">
        </div>

        <div class="mb-3">
            <label class="form-label">Course</label>
            <select class="form-select" name="type">
                <option selected>Select</option>
                <option value="CSE">CSE</option>
                <option value="ISE">ISE</option>
                <option value="AIML">AIML</option>
            </select>
        </div>

        <div class="mb-3">
            <div class="col">
                <label class="form-label">Roll Number</label>
                <input type="number" class="form-control" name="rollno" placeholder="Enter your roll number">
            </div>
            <div class="mb-3">
                <label class="form-label">Staff Name</label>
                <input type="text" class="form-control" name="Sname" placeholder="Enter Staff name">
            </div>
        <div class="mb-3">
            <label class="form-label">Feedback</label>
            <textarea class="form-control" name="desc" rows="4" placeholder="Enter your feedback"></textarea>
        </div>


        <div class="d-grid">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>

</body>
</html>