package in.witsolapur.pojo;

import java.io.Serializable;

public class Question implements Serializable {

	int  qno;
	private String question,op1,op2,op3,op4;
	int  ans;

	public Integer getQno() {
		return qno;
	}

	public void setQno(Integer qno) {
		this.qno = qno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}

	public Integer getAns() {
		return ans;
	}

	public void setAns(Integer ans) {
		this.ans = ans;
	}
}
