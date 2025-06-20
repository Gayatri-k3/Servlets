<!DOCTYPE html>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shoe Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
          crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
</head>

<body>
<a href="index.jsp" class="btn btn-outline-primary mt-3">Back</a>
<p class="h1 text-center pt-3">Find Shoe by ID</p>

<!-- ✅ Display Success / Error Messages -->
<div class="container text-center">
    <p class="text-success">${message}</p>
    <p class="text-danger">${errorMessage}</p>
</div>

<div class="container d-flex justify-content-center align-items-center">
    <div class="col-md-6 col-lg-6 col-sm-12">
        <form class="p-3 fs-5" action="shoe" method="GET" id="formValid">
            <div class="mb-3">
                <label for="shoeId" class="form-label">Enter the Shoe ID</label>
                <input type="text" class="form-control" id="shoeId" name="shoeID">
                <span id="shoeIdError" class="error small text-danger"></span>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

        <!-- ✅ Display ShoeDTO if present -->
        <c:if test="${not empty shoeDTO}">
            <div class="mt-4 border-top pt-3">
                <h5 class="text-success">Shoe Details</h5>
                <p><strong>Brand:</strong> ${shoeDTO.brand}</p>
                <p><strong>Type:</strong> ${shoeDTO.type}</p>
                <p><strong>Size:</strong> ${shoeDTO.size}</p>
                <p><strong>Payment:</strong> ${shoeDTO.payment}</p>
                <p><strong>Material:</strong> ${shoeDTO.material}</p>
                <p><strong>Manufactured Date:</strong> ${shoeDTO.manDate}</p>
                <p><strong>Created By:</strong> ${shoeDTO.created_by}</p>
                <p><strong>Created At:</strong> ${shoeDTO.created_at}</p>
            </div>
        </c:if>
    </div>
</div>

<script src="script.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
        crossorigin="anonymous"></script>
</body>
</html>
