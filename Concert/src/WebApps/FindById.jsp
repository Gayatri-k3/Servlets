
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Concert Event</title>
</head>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js" integrity="sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">

<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Concert</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
                <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                <a class="nav-link" href="Event.jsp">Book!</a>
                <a class="nav-link" href="FindAll.jsp">Show Events</a>
                <a class="nav-link" href="FindById.jsp">Find Event</a>
            </div>
        </div>
    </div>
</nav>
<!-- Search Form -->
<form action="findConcert" method="get">
    <h2>Find Booked Event</h2>
    <label for="id">ID:</label>
    <input type="number" name="id" id="id" required>
    <button type="submit">Search</button>
    <br><br>

</form>

<!-- Result using EL only -->
<div class="result" style="${concertDTO != null ? '' : 'display:none'}">
    <h3>Concert Details</h3>
    <p><strong>Name:</strong> ${concertDTO.name}</p>
    <p><strong>Email:</strong> ${concertDTO.email}</p>
    <p><strong>Contact Number:</strong> ${concertDTO.number}</p>
    <p><strong>Artist Name:</strong> ${concertDTO.AName}</p>
    <p><strong>Location:</strong> ${concertDTO.location}</p>
    <p><strong>Created At:</strong> ${concertDTO.created_at}</p>
</div>

<!-- Error Message -->
<p class="error" style="${errorMessage != null ? '' : 'display:none'}">${errorMessage}</p>

</body>
</html>
