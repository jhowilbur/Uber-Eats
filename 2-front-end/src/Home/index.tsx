import './styles.css'
import { ReactComponent as MainImage } from './main.svg' 

function Home() {
    return (
        <div className="home-container">
            <div className="home-content">
                <div className="home-actions">
                    <h1 className="home-title">
                        Place your order <br /> that we deliver <br /> for you !!!
                    </h1>
                    <h3 className="home-subtitle">
                        Choose your order and in a few minutes <br /> we'll take it to your door.
                    </h3>
                    <a  href="orders" className="home-btn-order">
                        MAKE A WISH
                    </a>
                </div>

                <div className="home-image">
                    <MainImage />
                </div>

            </div>
        </div>
    )
}

export default Home;