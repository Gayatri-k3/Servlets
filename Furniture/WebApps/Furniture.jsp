<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Furniture</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f5f5dc;
            margin: 0;
            font-family: 'Segoe UI', sans-serif;
        }

        .navbar {
            background-color: #d2b48c;
        }

        .navbar-brand, .nav-link {
            color: #4b2e1e !important;
            font-weight: bold;
        }

        .container-main {
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 60px 15px;
            min-height: calc(100vh - 100px);
        }

        .form-card {
            background-color: #fdf5e6;
            padding: 40px;
            border-radius: 16px;
            box-shadow: 0 8px 20px rgba(160, 82, 45, 0.2);
            max-width: 700px;
            width: 100%;
        }

        h2 {
            color: #6b4c3b;
            text-align: center;
            margin-bottom: 30px;
        }

        label {
            color: #4b2e1e;
            font-weight: 500;
        }

        .btn-beige {
            background-color: #d2b48c;
            border: none;
            color: white;
            font-weight: 500;
        }

        .btn-beige:hover {
            background-color: #bfa06f;
        }

        footer {
            background-color: #e6d8ad;
            text-align: center;
            padding: 12px;
            font-size: 0.9rem;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">MyApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link" href="index.jsp">Home</a>
            </div>
        </div>
    </div>
</nav>

<div class="container-main">
    <div class="form-card">
        <h2>Save Furniture Info </h2>
        <form action="furniture" method="post" class="row g-3">
            <div class="col-md-6">
                <label for="inputFN" class="form-label">Brand</label>
                <input type="text" class="form-control" name="inputFN" id="inputFN" placeholder="Enter Brand">
            </div>
            <div class="col-md-6">
                <label for="inputLN" class="form-label">Model Name</label>
                <input type="text" class="form-control" name="inputLN" id="inputLN" placeholder="Enter Model Name">
            </div>

            <div class="col-md-6">
                <label for="inputM" class="form-label">Material</label>
                <input type="text" class="form-control" name="inputM" id="inputM" placeholder="Enter Material">
            </div>

            <label for="msg" class="form-label">Size</label>
            <select class="form-select" aria-label="Default select example" name="size">
                <option selected>Size</option>
                <option value="S">Small</option>
                <option value="M">Medium</option>
                <option value="L">Large</option>
            </select>

            <div class="col-12">
                <label for="msg" class="form-label">Product Benefits</label>
                <textarea class="form-control" name="msg" id="msg" rows="4" ></textarea>
            </div>

            <div class="col-12 text-center mt-3">
                <button type="submit" class="btn btn-beige px-5">Save</button>
            </div>
        </form>
    </div>
</div>

<footer>
    <p>&copy; 2025 MyApp | Designed by Gayatri Kulkarni</p>
</footer>

</body>
</html>
