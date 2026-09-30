<!DOCTYPE html>
<html>
<head>
    <title>Exam Preparation</title>
</head>
<body>

<script>
    alert("Exams are near, have you started preparing for?");

    let answer = prompt("Have you started preparing? (Yes/No)");

    if (answer != null && answer.toLowerCase() == "yes") {
        let confirmBox = confirm("Are you ready for your exams?");

        if (confirmBox) {
            alert("Great! Keep studying and do your best.");
        } else {
            alert("Start preparing seriously from today.");
        }
    } else {
        alert("Please start your exam preparation soon.");
    }
</script>

</body>
</html>
