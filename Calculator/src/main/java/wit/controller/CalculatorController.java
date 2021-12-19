package wit.controller;





import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;


import wit.domain.Result;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@GetMapping("/sum")
	public ResponseEntity<Result> sum(@RequestParam Double n1, @RequestParam Double n2) {
		Result n = new Result();
		Result x = new Result();
		Result y = new Result();
		n.setResult(n1);
		x.setResult(n2);
		y.setResult(n.getResult() + x.getResult());
		return ResponseEntity.ok(y);
	}

	@GetMapping("/subtraction")
	public ResponseEntity<Result> subtraction(@RequestParam Double n1, @RequestParam Double n2) {
		Result n = new Result();
		Result x = new Result();
		Result y = new Result();
		n.setResult(n1);
		x.setResult(n2);
		y.setResult(n.getResult() - x.getResult());
		return ResponseEntity.ok(y);
	}

	@GetMapping("/multiplication")
	public ResponseEntity<Result> multiplication(@RequestParam Double n1, @RequestParam Double n2) {
		Result n = new Result();
		Result x = new Result();
		Result y = new Result();
		n.setResult(n1);
		x.setResult(n2);
		y.setResult(n.getResult() * x.getResult());
		return ResponseEntity.ok(y);
	}

	@GetMapping("/division")
	public ResponseEntity<Result> division(@RequestParam Double n1, @RequestParam Double n2) {
		Result n = new Result();
		Result x = new Result();
		Result y = new Result();
		n.setResult(n1);
		x.setResult(n2);
		y.setResult(n.getResult() / x.getResult());
		return ResponseEntity.ok(y);
	}


}
