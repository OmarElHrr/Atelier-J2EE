<%--
  Created by IntelliJ IDEA.
  User: omare
  Date: 11/04/2023
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Table 09</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="lib/css/style.css">

</head>
<body>
<section class="ftco-section">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6 text-center mb-5">
                <h2 class="heading-section">Bienvenue</h2>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="table-wrap">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>Nom</th>
                            <th>Prenom</th>
                            <th>CIN</th>
                            <th>Date</th>
                            <th>tele</th>
                            <th>Mail</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <th scope="row">${etudiant.nom}</th>
                            <td>${etudiant.prenom}</td>
                            <td>${etudiant.CIN}</td>
                            <td>${etudiant.getDatedeNaissance()}</td>
                            <td>${etudiant.tele}</td>
                            <td>${etudiant.mail}</td>
                        </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<script src="js/jquery.min.js"></script>
<script src="js/popper.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>

</body>
</html>


