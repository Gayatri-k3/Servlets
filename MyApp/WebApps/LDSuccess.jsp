<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>License Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            background-color: #f5f5dc; /* Beige */
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 900px;
            margin: 40px auto;
            padding: 35px;
            background-color: #fdf5e6; /* Light Beige */
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(160, 82, 45, 0.3);
        }
        h2 {
            color: #6b4c3b; /* Warm brown */
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 1.5rem;
        }
        thead {
            background-color: #deb887; /* Burlywood */
            color: #4b2e1e;
            font-weight: bold;
        }
        th, td {
            padding: 14px 18px;
            text-align: center;
            border: 1px solid #deb887;
            background-color: #fffaf0; /* Floral white */
            color: #4b2e1e;
        }
        footer {
            text-align: center;
            background-color: #e6d8ad; /* Light brown */
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
        /* Optional: highlight the active nav-link */
        .nav-link.active {
            text-decoration: underline;
            font-weight: bolder;
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
                <a class="nav-link" href="Donation.jsp">Donate</a>
                <a class="nav-link active" href="LicenseDetails.jsp">License Details</a>
                <a class="nav-link" href="FIR.jsp">FIR Details</a>
                <a class="nav-link" href="Laboratory.jsp">Laboratory</a>
                <a class="nav-link" href="FeedBack.jsp">Feedback</a>
            </div>
        </div>
    </div>
</nav>

<div class="container">
    <h2>Successfully registered for License!!</h2>

    <table>
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Vehicle Type</th>
            <th>Vehicle Number</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${ldDto.fn}</td>
            <td>${ldDto.ln}</td>
            <td>${ldDto.em}</td>
            <td>${ldDto.vehicleType}</td>
            <td>${ldDto.vehicleNumber}</td>
        </tr>
        </tbody>
    </table>
</div>

<footer>
    <p>&copy; 2025 MyApp | Designed by Gayatri Kulkarni</p>
</footer>
</body>
</html>
