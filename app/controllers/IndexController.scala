package controllers

import play.api.mvc.{Action, Controller}

final class IndexController extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

}
