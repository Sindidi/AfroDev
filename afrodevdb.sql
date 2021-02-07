-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 07 fév. 2021 à 18:39
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `afrodevdb`
--

-- --------------------------------------------------------

--
-- Structure de la table `post`
--

DROP TABLE IF EXISTS `post`;
CREATE TABLE IF NOT EXISTS `post` (
  `idPost` bigint(20) NOT NULL AUTO_INCREMENT,
  `commentaire` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `idUser` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idPost`),
  KEY `FK4oo7j67bw3q641l4itcacv7nb` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `profile`
--

DROP TABLE IF EXISTS `profile`;
CREATE TABLE IF NOT EXISTS `profile` (
  `idProfile` bigint(20) NOT NULL AUTO_INCREMENT,
  `adresse` varchar(30) DEFAULT NULL,
  `bio` varchar(255) DEFAULT NULL,
  `company` varchar(30) DEFAULT NULL,
  `facebook` varchar(50) DEFAULT NULL,
  `gitUser` varchar(30) DEFAULT NULL,
  `instagram` varchar(50) DEFAULT NULL,
  `langage` varchar(255) DEFAULT NULL,
  `linkedin` varchar(50) DEFAULT NULL,
  `siteWeb` varchar(30) DEFAULT NULL,
  `statu` varchar(20) DEFAULT NULL,
  `twitter` varchar(50) DEFAULT NULL,
  `youtube` varchar(50) DEFAULT NULL,
  `user_IdUser` bigint(20) DEFAULT NULL,
  `idUser` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`idProfile`),
  KEY `FKprmfoxre1uuxbhd2jop38par7` (`user_IdUser`),
  KEY `FK9utp7kd9xu51w57upqigyv529` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `IdUser` bigint(20) NOT NULL AUTO_INCREMENT,
  `avatar` varchar(255) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nom` varchar(30) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(30) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`IdUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `post`
--
ALTER TABLE `post`
  ADD CONSTRAINT `FK4oo7j67bw3q641l4itcacv7nb` FOREIGN KEY (`idUser`) REFERENCES `user` (`IdUser`);

--
-- Contraintes pour la table `profile`
--
ALTER TABLE `profile`
  ADD CONSTRAINT `FK9utp7kd9xu51w57upqigyv529` FOREIGN KEY (`idUser`) REFERENCES `user` (`IdUser`),
  ADD CONSTRAINT `FKprmfoxre1uuxbhd2jop38par7` FOREIGN KEY (`user_IdUser`) REFERENCES `user` (`IdUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
