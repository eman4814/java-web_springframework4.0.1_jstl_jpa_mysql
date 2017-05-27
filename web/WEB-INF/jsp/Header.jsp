<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Sistem Presensi</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/> ">
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom.css" />">
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.0.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js" />"></script>
    </head>
    <body>
        <div class="container">
            <!--include Header here -->
            <!--Header -->
            <div class="home-header navbar navbar-default navbar-fixed-top">
                <div class="row">
                    <div class="col-md-2 text-center"><img src="<c:url value="/resources/img/Logo.png" /> " alt="Logo" class="logo"></div>
                    <div class="col-md-10">
                        <ul class="nav navbar-nav navbar-left">
                            <li><a href="PresensiToday.htm"><img src="<c:url value="/resources/img/presensi.png" />"> Presensi</a></li>
                            <li><a href="TampilAllAdmin.htm"><img src="<c:url value="/resources/img/admin.png" />">Admin</a></li>
                            <li><a href="TampilAllKaryawan.htm"><img src="<c:url value="/resources/img/admin.png" />">Karyawan</a></li>
                            <li class="hidden"><a href="TampilDashboard.htm"><img src="<c:url value="/resources/img/dashboard.png" />">Dashboard</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!--End Header-->
