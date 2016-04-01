
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class ScheduleTest {
	private Schedule schedule;
	private Work work1;
	private Work work2;
	private Work work3;
	List<Work> lw;
	List<Double> a1;
	List<Double> a2;
	@Before
	public void setUp() throws Exception{
		schedule = new Schedule();
		work1 = new Work("work1",4,40);
		work2 = new Work("work2",3,30);
		work3 = new Work("work3",2,50);
		lw = new ArrayList<Work>();
		a1 = new ArrayList<Double>();
		lw.add(work1);
		lw.add(work2);
		lw.add(work3);		
		}
	@Test
	public void test() {
		a1 = schedule.FCFS(lw);
		a2 = schedule.SJF(lw);
		assertEquals(a1,schedule.FCFS(lw));
		assertEquals(a2,schedule.SJF(lw));
	}
	
	
}