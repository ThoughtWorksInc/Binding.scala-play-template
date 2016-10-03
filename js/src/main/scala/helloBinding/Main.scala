package helloBinding

import com.thoughtworks.binding.Binding.{Var, Vars}
import com.thoughtworks.binding.dom
import org.scalajs.dom.raw.Event
import org.scalajs.dom.html.Input
import org.scalajs.dom.document

/**
  * @author 杨博 (Yang Bo) &lt;pop.atry@gmail.com&gt;
  */
object Main extends scalajs.js.JSApp {

  @dom
  def render = {
    val name = Var("Binding.scala")
    val show = Var(false)
    <div>
      <p>
        <input type="checkbox" id="showCheckbox" onchange={_: Event => show := showCheckbox.checked }/>
        <label for="showCheckbox">
          Say hello to <input id="nameInput" value={name.get} oninput={_: Event => name := nameInput.value}/>
        </label>
      </p>
      {
        if (show.bind) {
          <p>
            Hello, {name.bind}!
          </p>
        } else {
          <!-- Don't show hello. -->
        }
      }
    </div>
  }

  def main(): Unit = {
    dom.render(document.body, render)
  }
}
