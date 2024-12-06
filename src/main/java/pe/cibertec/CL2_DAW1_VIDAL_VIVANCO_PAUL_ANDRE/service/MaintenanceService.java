package pe.cibertec.CL2_DAW1_VIDAL_VIVANCO_PAUL_ANDRE.service;

import pe.cibertec.CL2_DAW1_VIDAL_VIVANCO_PAUL_ANDRE.entity.Film;

import java.util.List;
import java.util.Optional;

public interface MaintenanceService {

    List<Film> getAllFilms();
    Optional<Film> getFilmById(Integer filmId);
    Film createFilm(Film film);
    Film updateFilm(Film film);
    void deleteFilm(Integer filmId);
}