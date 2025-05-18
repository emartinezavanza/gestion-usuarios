INSERT INTO rol (id, nombre) VALUES (1, 'ROLE_ADMIN');
INSERT INTO rol (id, nombre) VALUES (2, 'ROLE_USER');

INSERT INTO usuario (id, username, password) VALUES (1, 'admin', '$2a$12$HDSX0cvKBufl2aQAuCcrRuEIg7B61Tx1tcj5lRM1OVU7jhVFArLJS');
INSERT INTO usuario (id, username, password) VALUES (2, 'user', '$2a$12$HDSX0cvKBufl2aQAuCcrRuEIg7B61Tx1tcj5lRM1OVU7jhVFArLJS');

INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (1, 1);
INSERT INTO usuario_roles (usuario_id, roles_id) VALUES (2, 2);
