package page.devnet.telegrambot.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParsedCommand {

    Command command = Command.NONE;
    String text = "";

}
