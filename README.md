<!--
*** Thanks for checking out this README Template. If you have a suggestion that would
*** make this better, please fork the repo and create a pull request or simply open
*** an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/othneildrew/Best-README-Template"></a>

  <h1 align="center">Screenshot Test Playground</h1>

  <p align="center">
    This is a project of me playing with
    <a href="https://github.com/pedrovgs/Shot">Shot - a Gradle plugin and a core android library thought to run screenshot tests for Android.</a>
  </p>
</p>
<br>

<!-- TABLE OF CONTENTS -->
## Table of Contents
- [Table of Contents](#table-of-contents)
- [About](#about)
- [Built With](#built-with)
- [Contributing](#contributing)
- [Contact](#contact)

## About

How to run the snapshot test?
1. run this gradle script `./gradlew executeScreenshotTests -Precord` to record your screenshots (this screenshots will be used as the expected result)
2. do some changes on the ui or you can keep the ui as it is
3. run `./gradlew executeScreenshotTests` to verify your new ui is it match with the expected result or not.
4. you can see the result of the test in `/app/build/report/shot/verification/index.html`

result examples:
![failing test](/app/images/failingtest.png)

![success test](/app/images/successtest.png)

## Built With
* [Kotlin](https://kotlinlang.org/)
* [Androidx](https://developer.android.com/jetpack/androidx)
* [Jetpack Compose](https://developer.android.com/jetpack/compose)
* [Shot](https://github.com/pedrovgs/Shot)

<!-- CONTRIBUTING -->
## Contributing

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- CONTACT -->
## Contact

Anang Kurniawan
<p>
    <a href="https://www.linkedin.com/in/anangkur">LinkedIn</a> •
    <a href="https://medium.com/@anangk97">Medium</a> •
    <a href="https://dribbble.com/anangkur">Dribbble</a> •
    <a href="https://twitter.com/anang_kur">Twitter</a> •
    <a href="https://instagram.com/anang.kur">Instagram</a>
</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=flat-square
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=flat-square
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=flat-square
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=flat-square
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=flat-square
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/othneildrew


