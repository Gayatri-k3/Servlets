
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Feedback Submitted</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f0f8ff;
        }

        .success-container {
            max-width: 700px;
            margin: 50px auto;
            background: #fff;
            border-radius: 20px;
            padding: 40px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        }

        h2 {
            color: green;
        }

        .label {
            font-weight: bold;
            color: #333;
        }

        .value {
            color: #555;
        }
    </style>
</head>
<body>

<div class="container success-container">
    <h2 class="text-center">Feedback Submitted Successfully!</h2>
    <hr>

    <p><span class="label">Student Name:</span> <span class="value">${feedback.name}</span></p>
    <p><span class="label">Course:</span> <span class="value">${feedback.type}</span></p>
    <p><span class="label">Roll Number:</span> <span class="value">${feedback.rollno}</span></p>
    <p><span class="label">Staff Name:</span> <span class="value">${feedback.staffName}</span></p>
    <p><span class="label">Feedback:</span> <span class="value">${feedback.msg}</span></p>

    <div class="text-center mt-4">
        <a href="Feedback.jsp" class="btn btn-primary">Give Another Feedback</a>
        <a href="index.jsp" class="btn btn-outline-secondary">Back to Home</a>
    </div>
</div>

</body>
</html>
