<script>
        function validateForm() {
            const name = document.forms["concertForm"]["name"].value.trim();
            const email = document.forms["concertForm"]["email"].value.trim();
            const number = document.forms["concertForm"]["num"].value.trim();
            const aName = document.forms["concertForm"]["aName"].value.trim();
            const location = document.forms["concertForm"]["location"].value.trim();

            const nameRegex = /^[a-zA-Z ]{2,20}$/;
            const emailRegex = /^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$/;
            const numberRegex = /^[6-9][0-9]{9}$/;

            if (!nameRegex.test(name)) {
                alert("Name must be 2–20 characters long and contain only letters and spaces.");
                return false;
            }

            if (!emailRegex.test(email)) {
                alert("Please enter a valid email address.");
                return false;
            }

            if (!numberRegex.test(number)) {
                alert("Contact number must be a valid 10-digit Indian mobile number starting with 6-9.");
                return false;
            }

            if (!nameRegex.test(aName)) {
                alert("Artist name must be 2–20 characters long and contain only letters and spaces.");
                return false;
            }

            if (!nameRegex.test(location)) {
                alert("Location must be 2–20 characters long and contain only letters and spaces.");
                return false;
            }

            return true;
        }
    </script>