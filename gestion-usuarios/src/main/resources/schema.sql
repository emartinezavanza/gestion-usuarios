CREATE TABLE rol (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(255)
);

CREATE TABLE usuario (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(255),
  password VARCHAR(255)
);

CREATE TABLE usuario_roles (
  usuario_id BIGINT,
  roles_id BIGINT
);
