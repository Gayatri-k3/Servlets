<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            background-color: #f5f5dc; /* Beige */
        }
        .welcome-section {
            flex: 1;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            text-align: center;
            padding: 60px 20px;
            background-color: #fdf5e6; /* Lighter beige */
        }
        h1, h2 {
            color: #6b4c3b; /* Warm brown */
        }
        footer {
            text-align: center;
            background-color: #e6d8ad;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .navbar {
            background-color: #d2b48c !important; /* Tan */
        }
        .navbar-brand, .nav-link {
            color: #4b2e1e !important;
            font-weight: bold;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">MyApp</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link" href="Furniture.jsp">Furniture Details</a>

            </div>
        </div>
    </div>
</nav>

<div class="welcome-section">
    <h1>Successfully saved Furniture info!!</h1>
    <h2>Brand: ${brand}</h2>

</div>

<footer>
    <p>&copy; 2025 MyApp | Designed by Gayatri Kulkarni</p>
</footer>
</body>
</html>
