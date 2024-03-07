package video.order.domain;

import video.movie.domain.Movie;
import video.user.domain.User;

import java.time.LocalDate;

public class order {

    private User user;
    private Movie movie;

    private LocalDate orderDate;
    private LocalDate returnDate;

    //연체료 속성 추가.


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie moie) {
        this.movie = moie;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public order(User user, Movie moie) {
        this.user = user;
        this.movie = moie;
    }
}
