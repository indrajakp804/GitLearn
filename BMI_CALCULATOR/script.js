function calculateBMI() { 
    var heightInput = document.getElementById('height');
    var weightInput = document.getElementById('weight');
    var resultDiv = document.getElementById('result');
  
    var height = parseFloat(heightInput.value);
    var weight = parseFloat(weightInput.value);
  
    if (isNaN(height) || isNaN(weight)) {
      resultDiv.innerHTML = 'Please enter valid values for height and weight.';
      return;
    }
  
    var bmi = weight / Math.pow(height / 100, 2);
    var category = '';
  
    if (bmi < 18.5) {
      category = 'Underweight';
    } else if (bmi < 25) {
      category = 'Normal weight';
    } else if (bmi < 30) {
      category = 'Overweight';
    } else {
      category = 'Obesity';
    }
  
    resultDiv.innerHTML = 'Your BMI: ' + bmi.toFixed(2) + '<br>Category: ' + category;
  }