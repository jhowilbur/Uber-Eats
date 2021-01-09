import './styles.css'
import { ReactComponent as LinkedinIcon } from './linkedin.svg'
import { ReactComponent as GitHubIcon } from './github.svg'

function Footer() {
    return (
        <footer className="main-footer">
            simulating an ordering app
            <div className="footer-icons">
                <a href="https://github.com/jhowilbur/" target="_new">
                    <GitHubIcon />
                </a>
                <a href="https://www.linkedin.com/in/wilbur-dev/" target="_new">
                    <LinkedinIcon />
                </a>
            </div>
            
        </footer>
    )
}

export default Footer;