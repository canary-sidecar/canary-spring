package observability.canary.api.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter(AccessLevel.PUBLIC)
@Getter
@ToString
public class TodoEntity {
  private Integer id;
  private String subject;
  private String body;
  private Boolean completed;
}
