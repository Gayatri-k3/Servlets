<script>
    function validateForm() {
        let valid = true;

        // Clear previous error messages
        document.getElementById("nameError").textContent = "";
        document.getElementById("emailError").textContent = "";
        document.getElementById("numberError").textContent = "";
        document.getElementById("aNameError").textContent = "";
        document.getElementById("locationError").textContent = "";

        const name = document.getElementById("name").value.trim();
        const email = document.getElementById("email").value.trim();
        const number = document.getElementById("num").value.trim();
        const aName = document.getElementById("aName").value.trim();
        const location = document.getElementById("location").value.trim();

        const nameRegex = /^[a-zA-Z ]{2,20}$/;
        const emailRegex = /^[\w\.-]+@[\w\.-]+\.[a-zA-Z]{2,}$/;
        const numberRegex = /^[6-9][0-9]{9}$/;

        if (!nameRegex.test(name)) {
            document.getElementById("nameError").textContent = "Name must be 2–20 letters only.";
            valid = false;
        }

        if (!emailRegex.test(email)) {
            document.getElementById("emailError").textContent = "Invalid email format.";
            valid = false;
        }

        if (!numberRegex.test(number)) {
            document.getElementById("numberError").textContent = "Enter 10-digit number starting with 6-9.";
            valid = false;
        }

        if (!nameRegex.test(aName)) {
            document.getElementById("aNameError").textContent = "Artist name must be 2–20 letters only.";
            valid = false;
        }

        if (!nameRegex.test(location)) {
            document.getElementById("locationError").textContent = "Location must be 2–20 letters only.";
            valid = false;
        }

        return valid;
    }
</script>