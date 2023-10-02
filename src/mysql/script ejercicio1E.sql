-- 1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.

select nombre from jugadores  
order by nombre asc

-- 2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, 
-- ordenados por nombre alfabéticamente.

select nombre from jugadores j 
where Posicion = "C" and Peso > 200
order by nombre asc


-- 3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.

select nombre from equipos
order by nombre asc


-- 4. Mostrar el nombre de los equipos del este (East).

select nombre from equipos 
where Conferencia = "east"


-- 5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.

select * from equipos e 
where Ciudad like "C%"
order by nombre asc


-- 6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

select Nombre, Nombre_equipo  from jugadores j 
order by Nombre_equipo asc


-- 7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.

select * from jugadores j 
where Nombre_equipo like "Raptors"
order by Nombre 


-- 8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.

select Puntos_por_partido from estadisticas e 
join jugadores j on e.jugador = j.codigo 
where j.Nombre = "Pau Gasol"


-- 9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.

select Puntos_por_partido from estadisticas e 
join jugadores j on e.jugador = j.codigo 
where j.Nombre = "Pau Gasol" and temporada = "04/05"


-- 10. Mostrar el número de puntos de cada jugador en toda su carrera.

select j.nombre, sum(Puntos_por_partido) from estadisticas e 
join jugadores j on e.jugador = j.codigo 
group by j.Nombre 


-- 11. Mostrar el número de jugadores de cada equipo.

select Nombre_equipo, count(codigo) as CantidadJugadores from jugadores j 
group by Nombre_equipo 



-- 12. Mostrar el jugador que más puntos ha realizado en toda su carrera.

select j.nombre, sum(Puntos_por_partido) as SumaDePuntos from estadisticas e 
join jugadores j on e.jugador = j.codigo 
group by j.Nombre 
order by SumaDePuntos desc 
limit 1



-- 13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.

select j.Nombre, j.Altura, j.Nombre_equipo, e.Conferencia, e.Division from jugadores j 
join equipos e on j.Nombre_equipo = e.Nombre 
order by Altura desc 
limit 1


-- 14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.

select equipo_local, equipo_visitante, puntos_local, puntos_visitante, abs(puntos_local - puntos_visitante) as Diferencia from partidos p 
where abs(puntos_local - puntos_visitante) = (select abs(puntos_local - puntos_visitante) as dif from partidos order by dif desc limit 1)


-- 15. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), 
-- en caso de empate sera null.

select codigo, equipo_local, equipo_visitante, puntos_local , puntos_visitante ,
(if(puntos_local > puntos_visitante, equipo_local, if(puntos_local = puntos_visitante, null, equipo_visitante))) as equipo_ganador
from partidos p 



-- if(condicion, true, else)


-- if(condicion, true, if(condicion, true, else))


-- if(condicion, if(condicion, true, else), else)



































