package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "어바웃 타임";
        movieReview1.review = "인생은 무한 루프";
        movieReviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";
        movieReviews[1] = movieReview2;

//        MovieReview[] movieReviews = new MovieReview[]{movieReview1, movieReview2};

        for (int i = 0; i < movieReviews.length; i++) { // for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review); // 답 inception.title

        }

    }
}