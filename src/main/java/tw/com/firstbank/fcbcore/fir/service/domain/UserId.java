package tw.com.firstbank.fcbcore.fir.service.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserId implements Serializable {

	private static final long serialVersionUID = -1208015469289554049L;
	private String no;
	private String branchCode;
}
