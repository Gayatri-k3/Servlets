<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>FIR Submission Successful</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <style>
        body {
            background-color: #f5f5dc;
            margin: 0;
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 700px;
            margin: 40px auto;
            padding: 35px;
            background-color: #fdf5e6;
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(160, 82, 45, 0.3);
        }
        h2 {
            color: #6b4c3b;
            margin-bottom: 30px;
        }
        .info {
            margin-bottom: 15px;
        }
        .label {
            font-weight: bold;
            color: #4b2e1e;
        }
        footer {
            text-align: center;
            background-color: #e6d8ad;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>FIR Registered Successfully!</h2>
    <div class="info"><span class="label">First Name:</span> ${firDto.firstName}</div>
    <div class="info"><span class="label">Last Name:</span> ${firDto.lastName}</div>
    <div class="info"><span class="label">Email:</span> ${firDto.email}</div>
    <div class="info"><span class="label">Report:</span> ${firDto.report}</div>
    <div class="info"><span class="label">Date of Incident:</span> ${firDto.date}</div>
</div>

<footer>
    <p>&copy; 2025 MyApp | Designed by Gayatri Kulkarni</p>
</footer>

</body>
</html>
