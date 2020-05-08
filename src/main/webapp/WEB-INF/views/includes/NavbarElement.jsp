<header>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01"
      aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
      <a class="navbar-brand">Spring Security</a>
      <ul class="navbar-nav mr-auto mt-2 mt-lg-0">

        <li class="nav-item active">
          <a class="nav-link" href="/web-security/">Home Page</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/web-security/products">Products</a>
        </li>

        <security:authorize access="hasRole('ROLE_USER')">
          <li class="nav-item">
            <a class="nav-link" href="/web-security/user/profile">Profile</a>
          </li>
        </security:authorize>

        <security:authorize access="hasRole('ROLE_ADMIN')">
          <li class="nav-item">
            <a class="nav-link" href="/web-security/admin/dashboard">Dashboard</a>
          </li>
        </security:authorize>

        <security:authorize access="!isAuthenticated()">
          <li class="nav-item">
            <a class="nav-link" href="/web-security/login">Login</a>
          </li>
        </security:authorize>
        
        <security:authorize access="isAuthenticated()">
          <li class="nav-item">
            <a class="nav-link" href="/web-security/logout">Logout</a>
          </li>
        </security:authorize>
      </ul>
    </div>
  </nav>
</header>