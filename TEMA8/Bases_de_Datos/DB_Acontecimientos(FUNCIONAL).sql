-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema Acontecimientos
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Acontecimientos` ;

-- -----------------------------------------------------
-- Schema Acontecimientos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Acontecimientos` DEFAULT CHARACTER SET utf8 ;
USE `Acontecimientos` ;


-- -----------------------------------------------------
-- Table `Acontecimientos`.`Acontecimiento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Acontecimientos`.`Acontecimientos` ;

CREATE TABLE IF NOT EXISTS `Acontecimientos`.`Acontecimientos` (
  `id` INT(2) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NOT NULL,
  `lugar` VARCHAR(15) NOT NULL,
  `fecha` DATE NOT NULL,
  `hora_i` TIME NOT NULL,
  `hora_f` TIME NOT NULL,
  `aforo` INT(2) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Acontecimientos`.`Empresas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Acontecimientos`.`Empresas` ;

CREATE TABLE IF NOT EXISTS `Acontecimientos`.`Empresas` (
  `nif` VARCHAR(8) NOT NULL,
  `nombre` VARCHAR(20) NOT NULL,
  `razon_Social` VARCHAR(40) NOT NULL,
  `cnae` INT(5) NOT NULL,
  PRIMARY KEY (`nif`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Acontecimientos`.`PERSONA`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Acontecimientos`.`Personas` ;

CREATE TABLE IF NOT EXISTS `Acontecimientos`.`Personas` (
  `dni` VARCHAR(12) NOT NULL,
  `nombre` VARCHAR(15) NOT NULL,
  `apel1` VARCHAR(25) NOT NULL,
  `apel2` VARCHAR(25) NOT NULL,
  `tel` VARCHAR(13) NOT NULL,
  `nif_emp` VARCHAR(8) NOT NULL,
  PRIMARY KEY (`dni`),
  INDEX `fk_Persona_Empresas1_idx`(`nif_emp` ASC),
  CONSTRAINT `fk_Persona_Empresas1`
	FOREIGN KEY (`nif_emp`)
	REFERENCES `acontecimientos`.`Empresas`(`nif`)
	ON DELETE NO ACTION
	ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `Acontecimientos`.`Asistentes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Acontecimientos`.`Asistentes` ;

CREATE TABLE IF NOT EXISTS `Acontecimientos`.`Asistentes` (
  `id_acon` INT(2) NOT NULL,
  `id_asis` VARCHAR(12) NOT NULL,
  PRIMARY KEY (`id_acon`, `id_asis`),
  INDEX `fk_Acontecimiento_has_Persona_Persona1_idx` (`id_asis` ASC),
  INDEX `fk_Acontecimiento_has_Persona_Acontecimiento_idx` (`id_acon` ASC),
  CONSTRAINT `fk_Acontecimiento_has_Persona_Acontecimiento`
    FOREIGN KEY (`id_acon`)
    REFERENCES `Acontecimientos`.`Acontecimientos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Acontecimiento_has_Persona_Persona1`
    FOREIGN KEY (`id_asis`)
    REFERENCES `Acontecimientos`.`Personas` (`dni`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
