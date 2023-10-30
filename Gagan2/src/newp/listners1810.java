package newp;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listners1810 implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("started exe");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("exe succes");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(" exe failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("exe skipped");
	}
 
}
