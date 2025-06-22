<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Concert Event</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

</head>
<body>
<nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
    <div class="container-fluid" >
        <a class="navbar-brand" href="#">Concert</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <ul class="nav nav-tabs">
                    <li class="nav-item">
                <a class="nav-link" aria-current="page" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                <a class="nav-link" href="Event.jsp">Book!</a>
                    </li>
                    <li class="nav-item">
                <a class="nav-link" href="FindAll.jsp">Show Events</a>
                    </li>
                    <li class="nav-item">
                <a class="nav-link" href="FindById.jsp">Find Event</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>
<div class="d-flex justify-content-center">
<form name="concertForm" action="concert" method="post" onsubmit="return validateForm()">
    <h2 style="color:red;">${Failed}</h2>
    <h2>Book Concert</h2>
<div class="mb-3">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${param.name}" required>
    <span class="error" id="nameError"></span>
</div>
<div class="mb-3">
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${param.email}" required>
    <span class="error" id="emailError"></span>
</div>
    <div class="mb-3">
        <label for="num">Contact Number:</label>
        <input type="number" id="num" name="num" value="${param.num}" required>
        <span class="error" id="numberError"></span>
    </div>
    <div class="mb-3">
        <label for="aName">Artist Name:</label>
        <input type="text" id="aName" name="aName" value="${param.aName}" required>
        <span class="error" id="aNameError"></span>
    </div>
    <div class="mb-3">
    <label for="location">Location:</label>
    <input type="text" id="location" name="location" value="${param.location}" required>
    <span class="error" id="locationError"></span>
    </div>
    <button type="submit" class="btn btn-outline-primary">Book!</button>
</form>
</div>
</body>
</html>
