package love.charlesandlynn.cllab.ctrl;

import cn.pro_catherine.entities.StrPair;
import cn.pro_catherine.errors.CatsbError;
import cn.pro_catherine.future.api.StdDataResponse;
import cn.pro_catherine.sbtools.AbstractCatSbController;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController extends AbstractCatSbController {

  @RequestMapping("/check")
  public StdDataResponse<StrPair> check(HttpServletRequest request) throws CatsbError {
    final var req = prepare(request);
    final var lang = req.getLang();
    final var data = new StrPair("Hello", "World");
    return successRes(lang, data);
  }
}
