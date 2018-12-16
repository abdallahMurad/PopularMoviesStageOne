package com.am.popularmoviesstageone.data;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.am.popularmoviesstageone.data.model.Movie;

import java.util.List;


public class MainActivityViewModel extends AndroidViewModel {

    private MoviesRepository mRepository;
    private LiveData<List<Movie>> mFavMoviesList;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        mRepository = new MoviesRepository(application);
        mFavMoviesList = mRepository.getmFavMoviesList();
    }

    public void insert(Movie movie) {
        mRepository.insert(movie);
    }
    public void update(Movie movie) {
        mRepository.update(movie);
    }
    public void delete(Movie movie) {
        mRepository.delete(movie);
    }
    public void deleteAll() {
        mRepository.deleteAll();
    }

    public LiveData<List<Movie>> getFavMoviesList() {
        return mFavMoviesList;
    }
}
