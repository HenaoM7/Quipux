SELECT e."idEstudiantes", e.nombres, e.apellidos, m.nombre AS materia
FROM "Estudiantes" e
JOIN "MateriasEstudiantes" em ON e."idEstudiantes" = em."idEstudiante"
JOIN "Materias" m ON em."idMateria" = m."idMateria"
WHERE e.activo = 'activo' AND m.activo = 'activo';

SELECT e."idEstudiantes", e.nombres, e.apellidos, e.email 
FROM "Estudiantes" e
WHERE e.activo = 'activo' 
  AND e.email ILIKE '%gmail%'; 

SELECT *
FROM "Estudiantes"
WHERE activo = 'inactivo'
  AND edad > 18
  AND CAST(identificacion AS TEXT) LIKE '1%';


