package controllers

import javax.inject._
import play.api._
import play.api.libs.json.Json
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class UserController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val user = "hello world"
  /**
    * Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method
    * will be called when the application receives a `GET` request with
    * a path of `/`.
    */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(user))
  }

  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(user))
  }

  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(user))
  }

}