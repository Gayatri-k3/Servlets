<script>
document.querySelector("#form").addEventListener("submit", function (e) {
  document.querySelectorAll(".error").forEach((element) => {
    element.textContent = "";
  });

  const isValid =
    validateBrand() &&
    validateModel() &&
    validatePrice() &&
    validateAvailableAndWarranty() &&
    validateManufacturedDate();

  if (!isValid) {
    e.preventDefault();
  }
});

function validateBrand() {
  const brand = document.querySelector("#brand").value.trim();
  if (brand === "") {
    document.querySelector("#brandError").textContent = "Brand is required";
    return false;
  } else if (brand.length < 3 || brand.length > 25) {
    document.querySelector("#brandError").textContent =
      "Brand Characters must be between 3 and 25";
    return false;
  }
  return true;
}

function validateModel() {
  const model = document.querySelector("#model").value.trim();
  if (model === "") {
    document.querySelector("#modelError").textContent = "Model is required";
    return false;
  } else if (model.length < 3 || model.length > 25) {
    document.querySelector("#modelError").textContent =
      "Model Characters must be between 3 and 25";
    return false;
  }
  return true;
}

function validatePrice() {
  const price = document.querySelector("#price").value.trim();
  const numericPrice = parseFloat(price);
  if (price === "" || isNaN(numericPrice)) {
    document.querySelector("#priceError").textContent = "Price is required";
    return false;
  } else if (numericPrice < 10000 || numericPrice > 1000000) {
    document.querySelector("#priceError").textContent =
      "Price must be between 10,000 and 1,000,000";
    return false;
  }
  return true;
}

function validateAvailableAndWarranty() {
  const available = document.getElementsByName("isAvailable");
  const warranty = document.querySelector("#warranty").value;

  let isChecked = false;
  for (let i = 0; i < available.length; i++) {
    if (available[i].checked) {
      isChecked = true;
      break;
    }
  }
  if (!isChecked) {
    document.querySelector("#availableError").textContent =
      "Please select availability";
    return false;
  }

  if (warranty === "null" || warranty === "") {
    document.querySelector("#warrantyError").textContent =
      "Please select Warranty";
    return false;
  }
  return true;
}

function validateManufacturedDate() {
  const manufacturedDate = document.querySelector("#manufacturedDate").value.trim();
  if (manufacturedDate === "") {
    document.querySelector("#manufacturedDateError").textContent = "Fill the date";
    return false;
  } else {
    const currdate = new Date();
    currdate.setHours(0, 0, 0, 0);

    const [selectYear, selectMon, selectDate] = manufacturedDate.split("-").map(Number);
    const selected = new Date(selectYear, selectMon - 1, selectDate);

    if (selected >= currdate) {
      document.querySelector("#manufacturedDateError").textContent =
        "Manufactured Date should be in the past";
      return false;
    }
  }
  return true;
}
</script>
