
// Géneros
CREATE (:Genero {nombre: "Acción"});
CREATE (:Genero {nombre: "Comedia"});
CREATE (:Genero {nombre: "Drama"});

// Estados de ánimo
CREATE (:EstadoAnimo {nombre: "Feliz"});
CREATE (:EstadoAnimo {nombre: "Triste"});
CREATE (:EstadoAnimo {nombre: "Estresado"});

// Películas
CREATE (:Pelicula {titulo: "Rápidos y Furiosos", id: "p1"});
CREATE (:Pelicula {titulo: "Intensamente", id: "p2"});
CREATE (:Pelicula {titulo: "La La Land", id: "p3"});

// Relacionar películas con géneros
MATCH (p:Pelicula {id: "p1"}), (g:Genero {nombre: "Acción"}) CREATE (p)-[:PERTENECE_A]->(g);
MATCH (p:Pelicula {id: "p2"}), (g:Genero {nombre: "Comedia"}) CREATE (p)-[:PERTENECE_A]->(g);
MATCH (p:Pelicula {id: "p3"}), (g:Genero {nombre: "Drama"}) CREATE (p)-[:PERTENECE_A]->(g);

// Relacionar películas con estado de ánimo
MATCH (p:Pelicula {id: "p2"}), (e:EstadoAnimo {nombre: "Feliz"}) CREATE (p)-[:ES_APROPIADA_PARA]->(e);
MATCH (p:Pelicula {id: "p3"}), (e:EstadoAnimo {nombre: "Triste"}) CREATE (p)-[:ES_APROPIADA_PARA]->(e);

// Usuario
CREATE (:Usuario {id: "u1", nombre: "Carlos"});

// Preferencias del usuario
MATCH (u:Usuario {id: "u1"}), (g:Genero {nombre: "Comedia"}) CREATE (u)-[:LE_GUSTA]->(g);
MATCH (u:Usuario {id: "u1"}), (e:EstadoAnimo {nombre: "Feliz"}) CREATE (u)-[:TIENE_ESTADO_ANIMO]->(e);
MATCH (u:Usuario {id: "u1"}), (p:Pelicula {id: "p1"}) CREATE (u)-[:VIO]->(p);
