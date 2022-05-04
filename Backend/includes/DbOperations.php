<?php

    class DbOperation{

        private $con;

        function __construct(){
            require_once dirname(__FILE__).'/DbConnect.php';
            $db = new DbConnect();
            $this->con = $db->connect();
        }

        /*
         * CRUD -> Create 
         */

         function createUser($username,$pass,$email){
            $password = md5($pass);
            $query = $this->con->prepare("INSERT INTO `users` (`id`, `username`, `password`, `email`) VALUES (null, ?, ?, ?)");
            $query->bind_param("sss",$username,$password,$email);
            if($query->execute()){
                return true;
            }else{
                return false;
            }

    }
}

?>