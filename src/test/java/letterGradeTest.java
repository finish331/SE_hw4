import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class letterGradeTest {

    @Test
    public void equivalence_partitioning_grade_A(){
        char result = letterGrade.letterGrade(95);

        assertEquals('A', result);
    }

    @Test
    public void equivalence_partitioning_grade_B(){
        char result = letterGrade.letterGrade(85);

        assertEquals('B', result);
    }

    @Test
    public void equivalence_partitioning_grade_C(){
        char result = letterGrade.letterGrade(75);

        assertEquals('C', result);
    }

    @Test
    public void equivalence_partitioning_grade_D(){
        char result = letterGrade.letterGrade(65);

        assertEquals('D', result);
    }

    @Test
    public void equivalence_partitioning_grade_F(){
        char result = letterGrade.letterGrade(55);

        assertEquals('F', result);
    }

    @Test
    public void equivalence_partitioning_grade_X_under_zero(){
        char result = letterGrade.letterGrade(-1);

        assertEquals('X', result);
    }

    @Test
    public void equivalence_partitioning_grade_X_upper_one_hundred(){
        char result = letterGrade.letterGrade(101);

        assertEquals('X', result);
    }

    @Test
    public void boundary_grade_100(){
        char upperBoundaryResult = letterGrade.letterGrade(101);
        char boundaryResult = letterGrade.letterGrade(100);
        char underBoundaryResult = letterGrade.letterGrade(99);

        assertEquals('X', upperBoundaryResult);
        assertEquals('A', boundaryResult);
        assertEquals('A', underBoundaryResult);
    }

    @Test
    public void boundary_grade_90(){
        char upperBoundaryResult = letterGrade.letterGrade(91);
        char boundaryResult = letterGrade.letterGrade(90);
        char underBoundaryResult = letterGrade.letterGrade(89);

        assertEquals('A', upperBoundaryResult);
        assertEquals('A', boundaryResult);
        assertEquals('B', underBoundaryResult);
    }

    @Test
    public void boundary_grade_80(){
        char upperBoundaryResult = letterGrade.letterGrade(81);
        char boundaryResult = letterGrade.letterGrade(80);
        char underBoundaryResult = letterGrade.letterGrade(79);

        assertEquals('B', upperBoundaryResult);
        assertEquals('B', boundaryResult);
        assertEquals('C', underBoundaryResult);
    }

    @Test
    public void boundary_grade_70(){
        char upperBoundaryResult = letterGrade.letterGrade(71);
        char boundaryResult = letterGrade.letterGrade(70);
        char underBoundaryResult = letterGrade.letterGrade(69);

        assertEquals('C', upperBoundaryResult);
        assertEquals('C', boundaryResult);
        assertEquals('D', underBoundaryResult);
    }

    @Test
    public void boundary_grade_60(){
        char upperBoundaryResult = letterGrade.letterGrade(61);
        char boundaryResult = letterGrade.letterGrade(60);
        char underBoundaryResult = letterGrade.letterGrade(59);

        assertEquals('D', upperBoundaryResult);
        assertEquals('D', boundaryResult);
        assertEquals('F', underBoundaryResult);
    }

    @Test
    public void boundary_grade_0(){
        char upperBoundaryResult = letterGrade.letterGrade(1);
        char boundaryResult = letterGrade.letterGrade(0);
        char underBoundaryResult = letterGrade.letterGrade(-1);

        assertEquals('F', upperBoundaryResult);
        assertEquals('F', boundaryResult);
        assertEquals('X', underBoundaryResult);
    }
}
