-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `acontecimientos` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `acontecimientos` DEFAULT CHARACTER SET utf8 ;
USE `acontecimientos` ;

-- -----------------------------------------------------
-- Table `mydb`.`acontecimiento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `acontecimientos`.`Acontecimientos` ;

CREATE TABLE IF NOT EXISTS `acontecimientos`.`Acontecimientos` (
  `id` INT(2) NOT NULL,
  `nombre` VARCHAR(15) NOT NULL,
  `lugar` VARCHAR(15) NOT NULL,
  `fecha` DATE NOT NULL,
  `hora_i` TIME NOT NULL,
  `hora_f` TIME NOT NULL,
  `aforo` INT(2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`empresa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `acontecimientos`.`Empresas` ;

CREATE TABLE IF NOT EXISTS `acontecimientos`.`Empresas` (
  `nif` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `razon_social` VARCHAR(40) NOT NULL,
  `cnae` INT(5) NOT NULL,
  PRIMARY KEY (`nif`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`asistente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `acontecimientos`.`Personas` ;

CREATE TABLE IF NOT EXISTS `acontecimientos`.`Personas` (
  `dni` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(15) NOT NULL,
  `apel1` VARCHAR(25) NOT NULL,
  `apel2` VARCHAR(25) NOT NULL,
  `tel` VARCHAR(13) NOT NULL,
  `nif_emp` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`dni`),
  INDEX `fk_asistente_empresa_idx` (`nif_emp` ASC),
  CONSTRAINT `fk_asistente_empresa`
    FOREIGN KEY (`nif_emp`)
    REFERENCES `acontecimientos`.`Empresas` (`nif`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`acontecimiento_has_asistente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `acontecimientos`.`Asistentes` ;

CREATE TABLE IF NOT EXISTS `acontecimientos`.`Asistentes` (
  `id_acon` INT(2) NOT NULL,
  `id_asis` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`id_acon`, `id_asis`),
  INDEX `fk_acontecimiento_asistente1_idx` (`id_asis` ASC),
  INDEX `fk_acontecimiento_has_asistentes_acontecimiento1_idx` (`id_acon` ASC),
  CONSTRAINT `fk_acontecimiento_has_asistentes_acontecimiento1`
    FOREIGN KEY (`id_acon`)
    REFERENCES `acontecimientos`.`Acontecimientos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_acontecimiento_has_asistente_asistente1`
    FOREIGN KEY (`id_asis`)
    REFERENCES `Acontecimientos`.`Personas` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
