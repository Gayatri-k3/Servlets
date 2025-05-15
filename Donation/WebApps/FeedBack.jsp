<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>MyApp</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f5f5dc; /* Beige */
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
        }
        .form-container {
            max-width: 700px;
            margin: 40px auto;
            padding: 35px;
            background-color: #fdf5e6;
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(160, 82, 45, 0.3);
        }
        footer {
            text-align: center;
            background-color: #e6d8ad;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        h2 {
            color: #6b4c3b;
        }
        label {
            color: #4b2e1e;
        }
        .btn-beige {
            background-color: #d2b48c;
            border: none;
            color: white;
        }
        .btn-beige:hover {
            background-color: #bfa06f;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg" style="background-color: #d2b48c;">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp" style="color: #4b2e1e; font-weight: bold;">MyApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link" href="index.jsp" style="color: #4b2e1e;">Home</a>
            </div>
        </div>
    </div>
</nav>

<div class="form-container">
    <h2 class="text-center mb-4">Please give your feedback</h2>
    <form action="FBSubmit" method="post" class="row g-3">
        <div class="col-md-6">
            <label class="form-label">First Name</label>
            <input type="text" class="form-control" name="inputfn" placeholder="First name" required>
        </div>
        <div class="col-md-6">
            <label class="form-label">Last Name</label>
            <input type="text" class="form-control" name="inputln" placeholder="Last name" required>
        </div>
        <div class="col-12">
            <label class="form-label">Email</label>
            <input type="email" class="form-control" name="em" placeholder="abc@example.com" required>
        </div>
        <div class="col-md-6">
            <label class="form-label">Message</label>
            <input type="text" class="form-control" name="msg">
        </div>
        <div class="col-12 text-center mt-3">
            <button type="submit" class="btn btn-beige px-5">Submit</button>
        </div>
    </form>
</div>

<footer>
    <p>&copy; 2025 MyApp | Designed by Gayatri Kulkarni</p>
</footer>
</body>
</html>
